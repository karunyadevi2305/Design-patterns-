/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */

    /**
 * Represents the paused state of the printer.
 */
public class PausedState implements PrinterState {
    private Printer printer;

    /**
     * Constructs a new paused state for the given printer.
     *
     * @param printer the printer
     */
    public PausedState(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        System.out.println("Print job is paused.");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling print job...");
        printer.setState(new IdleState(printer));
    }

    @Override
    public void pause() {
        System.out.println("Already paused.");
    }

    @Override
    public void resume() {
        System.out.println("Resuming print job...");
        printer.setState(new PrintingState(printer));
    }
}

