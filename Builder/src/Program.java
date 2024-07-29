/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
//program combined
public class Program {
    private String sourceCode;
    private String compilerFlags;
    private String outputFile;

    public Program(String sourceCode, String compilerFlags, String outputFile) {
        this.sourceCode = sourceCode;
        this.compilerFlags = compilerFlags;
        this.outputFile = outputFile;
    }

    public void compile() {
        System.out.println("Compiling program...");
        System.out.println("Source code: " + sourceCode);
        System.out.println("Compiler flags: " + compilerFlags);
        System.out.println("Output file: " + outputFile);
        System.out.println("Compilation successful!");
    }
}
