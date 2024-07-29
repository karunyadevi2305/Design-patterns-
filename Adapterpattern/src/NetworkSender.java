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
public class NetworkSender {
    public byte[] sendMessage(ClientMessage message) {
        MachineLanguage machineCode = new ClientMessageAdapter(message);
        byte[] data = machineCode.getMachineCode();
        // Send the machine code over the network
        System.out.println("Sending machine code: " + Arrays.toString(data));
        return data;
    }
}