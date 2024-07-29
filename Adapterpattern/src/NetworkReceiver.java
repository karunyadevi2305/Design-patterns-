/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author KARUNYA DEVI M
 */
public class NetworkReceiver {
    public void receiveMessage(byte[] data) {
        System.out.println("Raw received data: " + Arrays.toString(data));
        // Convert the machine code back to the original message
        String message = new String(data);
        System.out.println("Received message: " + message);
    }
}