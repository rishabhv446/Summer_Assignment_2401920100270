abstract class  Compartment{
    public abstract String notice();
}
class FirstClass extends Compartment{
    public String notice(){
        return "First Class Compartment: Reserved for VIP passengers";
    }
}
class Ladies extends Compartment{
    public String notice(){
        return "Ladies Compartment: Reserved for ladies only";
    }
}
class General extends Compartment{
    public String notice(){
        return "General Compartment: Open for all passengers";
    }
}
class Luggage extends Compartment{
    public String notice(){
        return "Luggage Compartment: used for luggage only";
    }
}

class TestCompartment{
    public static void main(String[] args){
        Compartment[] cabin = new Compartment[10];
        for(int i=0; i<10; i++){
            int choice = (int)(Math.random() * 4) + 1;
            switch(choice){
                case 1:
                    cabin[i] = new FirstClass();
                    break;
                case 2:
                    cabin[i] = new Ladies();
                    break;
                case 3:
                    cabin[i] = new General();
                    break;
                case 4:
                    cabin[i] = new Luggage();
                    break;
            }
            System.out.println(cabin[i].notice());
        }
    }
}