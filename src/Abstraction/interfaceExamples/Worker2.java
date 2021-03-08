package Abstraction.interfaceExamples;

public abstract class Worker2 implements ManualTester, AutomationTester{

    @Override
    public void writeTestScripts() {
        System.out.println("I use Selenium");
    }

    @Override
    public void doFunctionalTesting() {
        System.out.println("I do regression testing");
    }

    public abstract void planTestCases();

    @Override
    public void useJira() {
        System.out.println("I log issues");
    }
}
