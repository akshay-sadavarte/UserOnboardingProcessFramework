package main.java.com.bank.steps;

import main.java.com.bank.core.IProcessStep;
import main.java.com.bank.model.Context;

import static main.java.com.bank.utils.ProcessStepNames.EMAIL_ONBOARDING_STEP;

public class EmailOnboardingStep implements IProcessStep {

    private String emailAddress;

    public EmailOnboardingStep() {

    }
    public EmailOnboardingStep(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    @Override
    public void execute(Context context) {
        System.out.println("Executing EmailOnboardingStep ...");
        // Logic to handle step
        context.setData(EMAIL_ONBOARDING_STEP, this.emailAddress);
    }

    @Override
    public String getName() {
        return EMAIL_ONBOARDING_STEP;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}