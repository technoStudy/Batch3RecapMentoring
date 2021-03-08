package Abstraction.interfaceExamples;

public class Worker1 implements ManualTester{

    @Override
    public void doFunctionalTesting() {
        System.out.println("I do integration test");
    }

    @Override
    public void planTestCases() {
        System.out.println("I do test plans");
    }

    @Override
    public void useJira() {
        System.out.println("I create bug tickets");
    }
}
