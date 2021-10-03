package superkeyword;

public class Child extends Father {

    //super keyword construction
    public Child(){
        super(20);
    }

    //super keyword in method
    public void higherEducation(){
        super.educated();
    }

    //super keyword in variables
    public void athleticSkills() {

        int numberOfSports = super.numberOfSport;
        System.out.println("he is practicing "+numberOfSports+" sports");
    }
}
