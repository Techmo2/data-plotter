package jdatagraph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class jDataFileManager
  extends JFrame
{
  public File loadGraphDataFile()
  {
    JFileChooser fileChooser = new JFileChooser();
    if (fileChooser.showOpenDialog(this) == 0)
    {
      File file = fileChooser.getSelectedFile();
      return file;
    }
    return null;
  }
  
  public float[] readLines(String filename)
    throws IOException
  {
    FileReader fileReader = new FileReader(filename);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    ArrayList<Float> lines = new ArrayList();
    String line = null;
    while ((line = bufferedReader.readLine()) != null) {
      lines.add(Float.valueOf(Float.parseFloat(line)));
    }
    bufferedReader.close();
    float[] returnValues = new float[lines.size()];
    int i = 0;
    for (Float f : lines) {
      returnValues[(i++)] = (f != null ? f.floatValue() : NaN.0F);
    }
    return returnValues;
  }
}
