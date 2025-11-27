package pz13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Program extends JFrame {
    private JLabel emotionLabel;
    private JButton joyButton;
    private JButton angerButton;
    private JButton fatigueButton;

    public Program() {

        setTitle("Эмоции - Вариант 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        createComponents();

        setupLayout();

        addEventHandlers();
    }

    private void createComponents() {

        emotionLabel = new JLabel("Выберите эмоцию", SwingConstants.CENTER);
        emotionLabel.setFont(new Font("Arial", Font.BOLD, 16));

        joyButton = new JButton("Радость");
        angerButton = new JButton("Злость");
        fatigueButton = new JButton("Усталость");

        Dimension buttonSize = new Dimension(100, 30);
        joyButton.setPreferredSize(buttonSize);
        angerButton.setPreferredSize(buttonSize);
        fatigueButton.setPreferredSize(buttonSize);
    }

    private void setupLayout() {

        setLayout(new BorderLayout(10, 10));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        buttonPanel.add(joyButton);
        buttonPanel.add(angerButton);
        buttonPanel.add(fatigueButton);

        add(emotionLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    private void addEventHandlers() {

        joyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emotionLabel.setText("Радость");
                emotionLabel.setForeground(Color.GREEN);
            }
        });

        angerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emotionLabel.setText("Злость");
                emotionLabel.setForeground(Color.RED);
            }
        });

        fatigueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emotionLabel.setText("Усталость");
                emotionLabel.setForeground(Color.BLUE);
            }
        });

        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JButton source = (JButton) e.getSource();
                String emotion = source.getText();
                System.out.println("Навёл на кнопку " + emotion);
            }

            @Override
            public void mouseExited(MouseEvent e) {}

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}
        };

        joyButton.addMouseListener(mouseListener);
        angerButton.addMouseListener(mouseListener);
        fatigueButton.addMouseListener(mouseListener);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Program().setVisible(true);
            }
        });
    }
}