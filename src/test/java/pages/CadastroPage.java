package pages;

import appium.core.Commands;

public class CadastroPage extends Commands {

    private static final String FIELD_CEL = "insira o numero de celular";
    private static final String FIELD_NOME = "Insira o nome completo";
    private static final String BTN_AVANCAR = "Botao Avancar";
    private static final String BTN_LOCALIZACAO = "LOCALIZAÇÃO AUTOMÁTICA";
    private static final String BTN_SIM = "Sim";

    public void preencherCampo( String field, String keys ) {
        switch( field ) {
            case "Celular":
                sendKeysOnField( keys, FIELD_CEL );
                break;
            case "Nome":
                sendKeysOnField( keys, FIELD_NOME );
                break;
        }

    }

    public void clicarEmAvancar() {
        clickOnAccessibilityId( BTN_AVANCAR );
    }

    public void clicarEmCompartilharLocalizacao() {
        clickOnAccessibilityId( BTN_LOCALIZACAO );
    }

    public void clicarEmSim() {
        clickOnAccessibilityId( BTN_SIM );
    }

}
