package main.java.com.bank.process;

import main.java.com.bank.core.IProcess;
import main.java.com.bank.model.Context;

import java.util.ArrayList;
import java.util.List;

public class UserOnboardingProcess implements IProcess {

    private List<IProcess> steps;

    public UserOnboardingProcess() {
        steps = new ArrayList<>();
    }
    
    public void addStep(IProcess step) {
        steps.add(step);
    }

    public void removeStep(IProcess step) {
        steps.remove(step);
    }

    @Override
    public void execute(Context context) {
        for (IProcess step : steps) {
            step.execute(context);
        }
    }
}
