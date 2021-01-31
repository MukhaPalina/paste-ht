import PastePo.PastePo;

public class PastieHomeTask {
    public static void main(String[] args) throws InterruptedException {
        PastePo pastePo = new PastePo();

        pastePo.getCodeInput()
                .sendKeys("Hello from WebDriver");
        pastePo.getNameInput()
                .sendKeys("helloweb");
        pastePo.setExpiration();
        pastePo.submitPaste();

        Thread.sleep(10000);
        pastePo.quit();

    }
}
