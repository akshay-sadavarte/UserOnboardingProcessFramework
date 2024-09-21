package main.java.com.bank.core;

import main.java.com.bank.model.Context;

public interface IProcessStep extends IProcess {

    @Override
    void execute(Context context);

    String getName();
}
