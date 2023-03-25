package com.example.rgbcontrol;

import java.io.*;
import java.nio.file.Files;

public class Builder {

    private final File executeScript;

    public Builder() throws IOException {
        executeScript = createExecuterFile();
    }

    public void executer() throws IOException {
        try {
            ProcessBuilder pb = new ProcessBuilder("bash", executeScript.toString());
            pb.inheritIO();
            Process process = pb.start();
            System.out.println("done");
            process.waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executeScript.delete();
        }
    }

    public File createExecuterFile() throws IOException {
        File script = File.createTempFile("script", null);

        Writer streamWriter = new OutputStreamWriter(Files.newOutputStream(script.toPath()));
        PrintWriter printWriter = new PrintWriter(streamWriter);

        printWriter.println("#!/bin/bash");
        printWriter.println("cd bin");
        printWriter.println("ls");

        return script;
    }

}
