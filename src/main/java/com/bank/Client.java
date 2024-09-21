package main.java.com.bank;

import main.java.com.bank.model.Context;
import main.java.com.bank.process.UserOnboardingProcess;
import main.java.com.bank.steps.AccountExistenceVerificationStep;
import main.java.com.bank.steps.CredentialVerificationStep;
import main.java.com.bank.steps.EmailOnboardingStep;
import main.java.com.bank.steps.MobileOnboardingStep;

import static main.java.com.bank.utils.ProcessStepNames.*;

public class Client {
    public static void main(String[] args) {

        Context context = new Context();

        UserOnboardingProcess process = new UserOnboardingProcess();
        process.addStep(new MobileOnboardingStep("9999999999"));
        process.addStep(new EmailOnboardingStep("emaple@gamail.com"));
        process.addStep(new CredentialVerificationStep("Aadhaar"));
        process.addStep(new AccountExistenceVerificationStep());

        process.execute(context);

        System.out.println("Mobile Onboarded: " + context.getData(MOBILE_ONBOARDING_STEP));
        System.out.println("Mobile Onboarded: " + context.getData(EMAIL_ONBOARDING_STEP));
        System.out.println("Credential Verified: " + context.getData(CREDENTIAL_VERIFICATION_STEP));
        System.out.println("Account Exists: " + context.getData(ACCOUNT_EXISTENCE_VERIFICATION_STEP));
    }
}
