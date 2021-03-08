package Abstraction.interfaceExamples;

public class Abstr {

    public static void main(String[] args) {
        Worker2 mehmet = new Worker2() {
            @Override
            public void planTestCases() {
                System.out.println("I plan smoke tests");
            }
        };

        Worker2 hatice = new Worker2() {
            @Override
            public void planTestCases() {
                System.out.println("I plan system tests.");
            }
        };

        hatice.planTestCases();
        mehmet.planTestCases();

        hatice.useJira();
        mehmet.useJira();
        
    }
}
