package codewithhriday.inheritance;

// Base Parent Class
class Grandfathers {
    String familyName;
    public Grandfathers(String familyName) {
        this.familyName = familyName;
    }
    void showFamilyName() {System.out.println("Family Surname: " + familyName);}
}

class Fatherss extends Grandfathers {
    String businessName;
    public Fatherss(String familyName, String businessName) {
        super(familyName); // Calls Grandfather constructor
        this.businessName = businessName;
    }


    void showBusiness() {System.out.println("Father's Business: " + businessName);}
}
interface Mother { void artisticSkill();}

// Child Class combining Class Inheritance and Interface Implementation (Hybrid)
class Childss extends Fatherss implements Mother {
    String childName;

    public Childss(String familyName, String businessName, String childName) {
        super(familyName, businessName); // Father constr
        this.childName = childName;
    }

    @Override
    public void artisticSkill() {
        System.out.println(childName + " inherited artistic skills from codewithhriday.inheritance.Mother.");
    }

    void displayInfo() {System.out.println("Child's Name: " + childName);}
}

// Main class to execute the hybrid structure
public class hybridinheritance {
    public static void main(String[] args) {
        Childss childObj = new Childss("Patil", "Patil Builders & Developers", "Hriday");

        System.out.println("----------- Accessing Family Heritage -----");
        childObj.showFamilyName();   //grandfather
        childObj.showBusiness(); //father
        childObj.artisticSkill();  //mother interface
        childObj.displayInfo(); //child
    }
}
