class Cellphone { private String brand;
    private String model;

public Cellphone(String brand, String model) {
    this.brand = brand;
    this.model = model;
    }

public void ring() { System.out.println("Ringing."); }
public void vibrate() { System.out.println("Vibrating"); }
public void lightUp() { System.out.println("Screen lighting up"); }

public String getDetails() {
return brand + " " + model;
}
}

class Main {
public static void main(String[] args) {
  Cellphone myPhone = new Cellphone("samsung", "galaxy S26 ultra");
  System.out.println("OPERATING PHONE : "+ myPhone.getDetails());
  myPhone.ring();
    }
}
