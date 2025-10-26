package homework3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW3 extends JFrame{


        private JLabel moodLabel;
        private JPanel mainPanel;

        public HW3() {
            setTitle("Цвет настроения");
            setSize(400, 250);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            mainPanel = new JPanel();
            mainPanel.setLayout(new FlowLayout());
            add(mainPanel, BorderLayout.CENTER);

            moodLabel = new JLabel("Выберите цвет настроения");
            moodLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(moodLabel, BorderLayout.SOUTH);

            JButton redButton = new JButton("Красный");
            JButton blueButton = new JButton("Синий");
            JButton greenButton = new JButton("Зелёный");

            mainPanel.add(redButton);
            mainPanel.add(blueButton);
            mainPanel.add(greenButton);

            //1
            ActionListener colorChangeListener = e -> {
                JButton source = (JButton) e.getSource();
                String colorName = source.getText();

                switch (colorName) {
                    case "Красный":
                        mainPanel.setBackground(Color.RED);
                        break;
                    case "Синий":
                        mainPanel.setBackground(Color.BLUE);
                        break;
                    case "Зелёный":
                        mainPanel.setBackground(Color.GREEN);
                        break;
                }

                moodLabel.setText("Ваш цвет настроения: " + colorName);
            };

            //2
            ActionListener consoleListener = e -> {
                JButton source = (JButton) e.getSource();
                System.out.println("Кнопка \"" + source.getText() + "\" была нажата!");
            };

            redButton.addActionListener(colorChangeListener);
            blueButton.addActionListener(colorChangeListener);
            greenButton.addActionListener(colorChangeListener);

            redButton.addActionListener(consoleListener);
            blueButton.addActionListener(consoleListener);
            greenButton.addActionListener(consoleListener);

            //3
            MouseListener hoverListener = new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    JButton source = (JButton) e.getSource();
                    JOptionPane.showMessageDialog(
                            HW3.this,
                            "Ты навёл курсор на кнопку \"" + source.getText() + "\"!",
                            "Подсказка",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            };

            redButton.addMouseListener(hoverListener);
            blueButton.addMouseListener(hoverListener);
            greenButton.addMouseListener(hoverListener);

            setVisible(true);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(HW3::new);
        }
    }
