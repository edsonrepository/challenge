package sowe.pageObjects;

import appium.core.Commands;

public class HomePage {

    private Commands commands = new Commands();

    public void clicarCadastrar() {
        commands.clickOnAccessibilityId( "Cadastrar" );
    }

}
