package CommandPattern;

public class Light {
   String loaction;

   public Light(String loc) {
      this.loaction = loc;
   }

   public void on() {
      System.out.println(loaction + " + light is on");
   }

   public void off() {
      System.out.println(loaction + " light is off");
   }
}
