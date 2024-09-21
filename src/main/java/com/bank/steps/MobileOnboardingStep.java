package main.java.com.bank.steps;

import main.java.com.bank.core.IProcessStep;
import main.java.com.bank.model.Context;

import static main.java.com.bank.utils.ProcessStepNames.MOBILE_ONBOARDING_STEP;

public class MobileOnboardingStep implements IProcessStep {

    private String mobileNumber;

    public MobileOnboardingStep() {
    }

    public MobileOnboardingStep(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void execute(Context context) {
        System.out.println("Executing mobile onboarding...");
        // Logic to handle step
        context.setData(MOBILE_ONBOARDING_STEP, this.mobileNumber);
    }

    @Override
    public String getName() {
        return MOBILE_ONBOARDING_STEP;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}