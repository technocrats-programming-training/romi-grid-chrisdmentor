package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {

  int x = 0;
  int y = 0;
  char d = N;


    public void driveUp() throws InterruptedException {
      driveDistance(10);
      x = x+10;
    }

    public void driveDown() throws InterruptedException {
      driveDistance(-10);
      x = x-10;
    }

    public void driveRight() throws InterruptedException {
      if (d == N) {
        d = W;
        x = x+10;
      } elseif (d == E) {
        d = N;
        y = y+10;
      } elseif (d == S){
        d = E;
        x = x-10;
      } else {
        d = S;
        y = y-10;
      }
      turnDegrees(90);
      driveDistance(10);
    }

    public void driveLeft() throws InterruptedException {
      turnDegrees(-90);
      driveDistance(10);
    }

    public void returnToHome() {

    }

    public String toString() {
        return "(x, y)";
    }
}
