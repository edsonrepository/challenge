package sowe.pageObjects;

import appium.core.Commands;

public class CadastroPage {

    private static final String FIELD_CEL = "insira o numero de celular";
    private static final String FIELD_NOME = "Insira o nome completo";
    private static final String BTN_AVANCAR = "Botao Avancar";
    private static final String BTN_LOCALIZACAO = "LOCALIZAÇÃO AUTOMÁTICA";
    private static final String BTN_SIM = "Sim";

    Commands commands = new Commands();

    public void preencherCampo( String field, String keys ) {
        switch( field ) {
            case "Celular":
                commands.sendKeysOnField( keys, FIELD_CEL );
                break;
            case "Nome":
                commands.sendKeysOnField( keys, FIELD_NOME );
                break;
        }

    }

    public void clicarEmAvancar() {
        commands.clickOnAccessibilityId( BTN_AVANCAR );
    }

    public void clicarEmCompartilharLocalizacao() {
        commands.clickOnAccessibilityId( BTN_LOCALIZACAO );
    }

    public void clicarEmSim() {
        commands.clickOnAccessibilityId( BTN_SIM );
    }

}
