import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class TransApplicationComponent {
    public TransApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", TransProgressBarUi.class.getName());
        UIManager.getDefaults().put(TransProgressBarUi.class.getName(), TransProgressBarUi.class);
    }
}
