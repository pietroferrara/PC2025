from sqlalchemy import create_engine, Column, String, ForeignKey, JSON
from sqlalchemy.orm import declarative_base, sessionmaker

Base = declarative_base()

class Device(Base):
    __tablename__ = "Device"
    identifier = Column(String, primary_key=True)

    def __init__(self, identifier):
        self.identifier = identifier

    def get_id(self):
        return self.identifier

class Computer(Device):
    __tablename__ = "Computer"
    identifier = Column(String, ForeignKey('Device.identifier'), primary_key=True)
    sentmessage = Column(JSON)
    receivedmessage =  Column(JSON)

    def __init__(self, identifier):
        Device.__init__(self, identifier)
        self.sentmessage = []
        self.receivedmessage = []

    def send_message(self, message: object):
        self.sentmessage.append(message)

    def receive_message(self, message: object):
        self.receivedmessage.append(message)

    def addition(self, a, b):
        return a + b

    def multiplication(self, a, b):
        return a * b


class Telephone(Device):
    __tablename__ = "Telephone"
    identifier = Column(String, ForeignKey('Device.identifier'), primary_key=True)
    sentmessage = Column(JSON)
    receivedmessage = Column(JSON)

    def __init__(self, identifier):
        Device.__init__(self, identifier)
        self.sentmessage = []
        self.receivedmessage = []

    def send_message(self, message: str):
        self.sentmessage.append(message)

    def receive_message(self, message: str):
        self.receivedmessage.append(message)


#class Smartphone(Computer, Telephone):
#    __tablename__ = 'Smartphone'
#    identifier = Column(String, ForeignKey('Computer.id'), primary_key=True)
#    telephone_identifier = Column(String, ForeignKey('Telephone.id'))
#
#    def __init__(self, identifier):
#        Device.__init__(self, identifier)
#        self.sentmessage = []
#        self.receivedmessage = []
# ca marche pas!
# sqlalchemy.exc.InvalidRequestError: Class <class '__main__.Smartphone'> has multiple mapped bases: [<class '__main__.Computer'>, <class '__main__.Telephone'>]



engine = create_engine("sqlite:///devices.db", echo=True)

Base.metadata.create_all(engine)
Session = sessionmaker(bind=engine)
session = Session()


device = Device("dev2")
computer  = Computer("comp")
#smartphone = Smartphone("smartphone")
telephone = Telephone("telephone")

session.add(computer)
session.add(telephone)

computer.send_message("Hello I'm a computer")
telephone.receive_message("Hello I'm a computer")
#smartphone.send_message("Hello I'm a smartphone")
computer.receive_message("Hello I'm a smartphone")
telephone.send_message("Hello I'm a telephone")
computer.receive_message("Hello I'm a telephone")

#session.add(device)
#session.add(computer)
#session.add(telephone)
#print(computer.get_id())

session.commit()
session.close()