

public class Main {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            Student s = new     Student("592300" + i,
                    switch(i){
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java MasterClass");

            System.out.println(s);
        }

    }
}

// STUDENT:
// ID
// NAME
// DOB
// CLASSLIST