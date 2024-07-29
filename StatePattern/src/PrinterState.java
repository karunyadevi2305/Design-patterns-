/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
/**
 * Interface for printer states.
 */
public interface PrinterState {
    /**
     * Prints a document.
     */
    void print();

    /**
     * Cancels a print job.
     */
    void cancel();

    /**
     * Puts the printer in a paused state.
     */
    void pause();

    /**
     * Resumes a paused print job.
     */
    void resume();
}
