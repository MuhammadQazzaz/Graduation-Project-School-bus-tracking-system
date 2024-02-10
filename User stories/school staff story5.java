import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Message interface representing the messages that can be sent
interface Message {
    String getContent();
}

// Concrete implementation of Message representing text messages
class TextMessage implements Message {
    private String content;



public TextMessage(String content) {
    this.content = content;
}

@Override
public String getContent() {
    return content;
}
}

// Participant interface representing entities that can send and receive messages
interface MessageParticipant {
    void sendMessage(Message message);



void receiveMessage(Message message);
}

// Concrete implementation of MessageParticipant representing the school staff
class SchoolStaff implements MessageParticipant {
    private String name;



public SchoolStaff(String name) {
    this.name = name;
}

@Override
public void sendMessage(Message message) {
    System.out.println(name + " sent a message: " + message.getContent());
    // Add logic to notify the bus driver or handle the message
}

@Override
public void receiveMessage(Message message) {
    System.out.println(name + " received a message: " + message.getContent());
    // Add logic to handle the received message
}
}

// Concrete implementation of MessageParticipant representing the bus driver
class BusDriver implements MessageParticipant {
    private String name;



public BusDriver(String name) {
    this.name = name;
}

@Override
public void sendMessage(Message message) {
    System.out.println(name + " sent a message: " + message.getContent());
    // Add logic to notify the school staff or handle the message
}

@Override
public void receiveMessage(Message message) {
    System.out.println(name + " received a message: " + message.getContent());
    // Add logic to handle the received message
}
}

// Concrete implementation of MessageMediator facilitating communication between participants
class MessageMediator {
    private List<MessageParticipant> participants = new ArrayList<>();



public void addParticipant(MessageParticipant participant) {
    participants.add(participant);
}

public void sendMessage(MessageParticipant sender, Message message) {
    for (MessageParticipant participant : participants) {
        if (participant != sender) {
            participant.receiveMessage(message);
        }
    }
}
}

public class CommunicationDemo {
    public static void main(String[] args) {
        // Create instances of the school staff, bus driver, and message mediator
        SchoolStaff staffMember = new SchoolStaff("John");
        BusDriver busDriver = new BusDriver("Driver Jane");
        MessageMediator messageMediator = new MessageMediator();



    // Register participants with the message mediator
    messageMediator.addParticipant(staffMember);
    messageMediator.addParticipant(busDriver);

    // School staff member sends a message to the bus driver
    Message staffMessage = new TextMessage("Changes in the bus schedule");
    staffMember.sendMessage(staffMessage);
    messageMediator.sendMessage(staffMember, staffMessage);

    // Bus driver responds to the message
    Message driverMessage = new TextMessage("Noted. Will adjust accordingly.");
    busDriver.sendMessage(driverMessage);
    messageMediator.sendMessage(busDriver, driverMessage);
}
}
