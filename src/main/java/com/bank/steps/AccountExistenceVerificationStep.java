package main.java.com.bank.steps;

import main.java.com.bank.core.IProcessStep;
import main.java.com.bank.model.Context;

import static main.java.com.bank.utils.ProcessStepNames.ACCOUNT_EXISTENCE_VERIFICATION_STEP;

public class AccountExistenceVerificationStep implements IProcessStep {

    @Override
    public void execute(Context context) {
        System.out.println("Executing AccountExistenceVerificationStep ...");
        // Logic to handle step
        context.setData(ACCOUNT_EXISTENCE_VERIFICATION_STEP, true);
    }

    @Override
    public String getName() {
        return ACCOUNT_EXISTENCE_VERIFICATION_STEP;
    }
}
