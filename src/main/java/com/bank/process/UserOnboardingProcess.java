package main.java.com.bank.process;

import main.java.com.bank.core.IProcess;
import main.java.com.bank.core.IProcessStep;
import main.java.com.bank.model.Context;

import java.util.ArrayList;
import java.util.List;

public class UserOnboardingProcess implements IProcess {

    private List<IProcessStep> processSteps;

    public UserOnboardingProcess() {
        processSteps = new ArrayList<>();
    }

    public void addStep(int sequenceNumber, IProcessStep step) {
        processSteps.add(sequenceNumber, step);
    }

    public void replaceStep(int sequenceNumber, IProcessStep step) {
        processSteps.set(sequenceNumber, step);
    }

    public void removeStep(int sequenceNumber, IProcessStep step) {
        processSteps.remove(step);
    }

    @Override
    public void execute(Context context) {

        for (int i = 0; i < processSteps.size(); i++) {

            IProcessStep step = processSteps.get(i);
            step.execute(context);
            System.out.println("Process Step Name :- " + step.getName());
            System.out.println("Process Data :- " + context.getData(step.getName()));
            System.out.println();
        }
    }
}
