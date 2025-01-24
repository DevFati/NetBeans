/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Fatima
 */
public class Score {
    private int player1Score = 0;
    private int player2Score = 0;

    public void addPoint(int player) {
        if (player == 1) player1Score++;
        else if (player == 2) player2Score++;
    }

    public int getTotalScore() {
        return player1Score + player2Score;
    }

    public void draw(Graphics g, int width, int height) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.drawString(String.valueOf(player1Score), width / 4, 50);
        g.drawString(String.valueOf(player2Score), 3 * width / 4, 50);
    }
}
