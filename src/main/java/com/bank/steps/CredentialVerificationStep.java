package main.java.com.bank.steps;

import main.java.com.bank.core.IProcessStep;
import main.java.com.bank.model.Context;

import static main.java.com.bank.utils.ProcessStepNames.CREDENTIAL_VERIFICATION_STEP;

public class CredentialVerificationStep implements IProcessStep {

    private String credentialType;

    public CredentialVerificationStep(String credentialType) {
        this.credentialType = credentialType;
    }

    @Override
    public void execute(Context context) {
        System.out.println("Executing CredentialVerificationStep ...");
        // Logic to handle step
        context.setData(CREDENTIAL_VERIFICATION_STEP, true);
    }

    @Override
    public String getName() {
        return CREDENTIAL_VERIFICATION_STEP;
    }
}