package com.hashcode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author georgie
 */
abstract class DataExporter {

    public static void writeProblem(String fileName, List<Slide> slideList) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName));
        writer.write(String.valueOf(slideList.size()));
        writer.write("\n");
        for (Slide slide : slideList) {
            writer.write(slide.getId());
            writer.write("\n");
        }
        writer.close();
    }

}
