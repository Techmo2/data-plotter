package jdatagraph;

import java.io.PrintStream;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class jDataWindow
{
  int width;
  int height;
  int scale;
  float[] offset = { 0.0F, 0.0F };
  
  public jDataWindow(int width, int height, int scale, float[] offset)
    throws LWJGLException
  {
    this.width = width;
    this.height = height;
    this.scale = scale;
    this.offset = offset;
    initGL();
  }
  
  private void initGL()
    throws LWJGLException
  {
    Display.setDisplayMode(new DisplayMode(this.width, this.height));
    Display.create();
    GL11.glMatrixMode(5889);
    GL11.glLoadIdentity();
    GL11.glOrtho(0.0D, this.width, 0.0D, this.height, 1.0D, -1.0D);
    GL11.glMatrixMode(5888);
  }
  
  public void plotPointsAsData(float[] dataSet, int[] backgroundColor, int[] lineColor, int[] gridColor, int mode, boolean smooth, boolean grid)
  {
    float lastMouseX = 0.0F;
    float lastMouseY = 0.0F;
    boolean wasDownLastFrame = false;
    float minValue = Float.MAX_VALUE;
    float maxValue = Float.MIN_VALUE;
    for (int x = 0; x < dataSet.length; x++) {
      if (dataSet[x] < minValue) {
        minValue = dataSet[x];
      }
    }
    Display.setTitle("Bottom = " + Float.toString(minValue) + " Mouse = (x, y)");
    for (int x = 0; x < dataSet.length; x++) {
      if (dataSet[x] > maxValue) {
        maxValue = dataSet[x];
      }
    }
    System.out.println(mode);
    if (smooth)
    {
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
    }
    while (!Display.isCloseRequested())
    {
      if (Mouse.isButtonDown(0))
      {
        if (!wasDownLastFrame)
        {
          wasDownLastFrame = true;
          lastMouseX = Mouse.getX();
          lastMouseY = Mouse.getY();
        }
        this.offset = new float[] { this.offset[0] + (Mouse.getX() - lastMouseX), this.offset[1] + (Mouse.getY() - lastMouseY) };
        lastMouseX = Mouse.getX();
        lastMouseY = Mouse.getY();
      }
      else
      {
        wasDownLastFrame = false;
      }
      int wheel = Mouse.getDWheel();
      if (wheel != 0)
      {
        this.scale = ((int)(this.scale + 0.0125F * wheel));
        if (this.scale <= 0) {
          this.scale = 1;
        }
      }
      Display.setTitle(
        "Bottom = " + Float.toString(minValue) + " Mouse = (" + (Mouse.getX() - this.offset[0]) / this.scale + ", " + (Mouse.getY() + this.scale * minValue - this.offset[1]) / this.scale + ")");
      GL11.glClear(16640);
      GL11.glPointSize(this.scale / 2);
      GL11.glColor3f(backgroundColor[0] / 255.0F, backgroundColor[1] / 255.0F, backgroundColor[2] / 255.0F);
      GL11.glBegin(7);
      GL11.glVertex2d(0.0D, 0.0D);
      GL11.glVertex2d(0.0D, this.height);
      GL11.glVertex2d(this.width, this.height);
      GL11.glVertex2d(this.width, 0.0D);
      GL11.glEnd();
      if (grid)
      {
        GL11.glColor3f(gridColor[0] / 255.0F, gridColor[1] / 255.0F, gridColor[2] / 255.0F);
        for (float x = 0.0F; x < dataSet.length + 1; x += 1.0F)
        {
          for (float y = 0.0F; y < maxValue - minValue + 1.0F; y += 1.0F)
          {
            GL11.glBegin(1);
            GL11.glVertex2f(0.0F + this.offset[0], y * this.scale + this.offset[1]);
            GL11.glVertex2f(dataSet.length * this.scale + this.offset[0], y * this.scale + this.offset[1] + 1.0F);
            GL11.glEnd();
          }
          GL11.glBegin(1);
          GL11.glVertex2f(x * this.scale + this.offset[0], this.offset[1]);
          GL11.glVertex2f(x * this.scale + this.offset[0], (maxValue - minValue) * this.scale + this.offset[1] + this.scale);
          GL11.glEnd();
        }
      }
      GL11.glColor4f(lineColor[0] / 255.0F, lineColor[1] / 255.0F, lineColor[2] / 255.0F, 0.9F);
      if (mode == 1)
      {
        float[] lastValue = { 0.0F, dataSet[0] * this.scale - this.scale * minValue };
        GL11.glBegin(1);
        for (int x = 0; x < dataSet.length; x++)
        {
          GL11.glVertex2f(lastValue[0] + this.offset[0], lastValue[1] + this.offset[1]);
          GL11.glVertex2f(x * this.scale + this.offset[0], dataSet[x] * this.scale - this.scale * minValue + this.offset[1]);
          lastValue = new float[] { x * this.scale, dataSet[x] * this.scale - this.scale * minValue };
        }
        GL11.glEnd();
      }
      if (mode == 2)
      {
        GL11.glEnable(2832);
        GL11.glHint(3153, 4354);
        float size = 1.0F;
        GL11.glBegin(0);
        for (int x = 0; x < dataSet.length; x++) {
          GL11.glVertex2f(x * this.scale + this.offset[0], dataSet[x] * this.scale + this.offset[1] - this.scale * minValue);
        }
        GL11.glEnd();
        GL11.glFinish();
        GL11.glDisable(2832);
      }
      if (mode == 3)
      {
        GL11.glBegin(1);
        for (int x = 0; x < dataSet.length; x++)
        {
          GL11.glVertex2f(x * this.scale + this.offset[0], this.offset[1]);
          GL11.glVertex2f(x * this.scale + this.offset[0], dataSet[x] * this.scale + this.offset[1] - this.scale * minValue);
        }
        GL11.glEnd();
      }
      Display.update();
      Display.sync(60);
    }
    Display.destroy();
  }
}
