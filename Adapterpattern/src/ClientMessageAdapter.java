/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
public class ClientMessageAdapter implements MachineLanguage {
    private ClientMessage clientMessage;

    public ClientMessageAdapter(ClientMessage clientMessage) {
        this.clientMessage = clientMessage;
    }

    @Override
    public byte[] getMachineCode() {
        String message = clientMessage.getMessage();
        // Convert the message to machine code (e.g., ASCII to binary)
        byte[] machineCode = new byte[message.length()];
        for (int i = 0; i < message.length(); i++) {
            machineCode[i] = (byte) message.charAt(i);
        }
        return machineCode;
    }
}
