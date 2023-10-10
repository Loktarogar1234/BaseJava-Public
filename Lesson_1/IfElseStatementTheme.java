public class IfElseStatementTheme  {
    public static void main(String[] args) {
        
        System.out.println("\nЗадание 1. Вывод характеристик компьютера");
            int age = 21;
            double height = 1.8;
            boolean genderMan = true;

        if(!genderMan){
            System.out.println("You are WOMAN");
        } else {
            System.out.println("Yep, you are MAN");
        }
    
        if(age>18){
            System.out.println("You are adult");
        } else {
            System.out.println("You are child");
        }

        if(height>1.7){
            System.out.println("Watch you head! Low ceiling!");
        } else {
            System.out.println("You are welcome!");
        }

        char firstNameLetter = "Eugene".charAt(0);
        if(firstNameLetter == 'M'){
            System.out.println("First letter of your name is M");
        } else if(firstNameLetter == 'I') {
            System.out.println("First letter of your name is I");
        } else { System.out.println("First letter of your name is neither M nor I. You probably cheating!");
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}