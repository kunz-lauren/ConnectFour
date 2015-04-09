/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confour.frames;

import confour.ConnectFour;
import confour.GameControl;
import confour.Player;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniel
 */
public class Board extends javax.swing.JFrame {
    GameControl game = new GameControl();
    boolean turn;
    String piece;
    Player p1, p2;
    ImageIcon emptySpace = new ImageIcon("C:/Users/Daniel/Documents/NetBeansProjects/ConnectFour/ConnectFour/src/images/empty-piece.png");
    ImageIcon blackPiece = new ImageIcon("C:/Users/Daniel/Documents/NetBeansProjects/ConnectFour/ConnectFour/src/images/black-piece.png");
    ImageIcon redPiece = new ImageIcon("C:/Users/Daniel/Documents/NetBeansProjects/ConnectFour/ConnectFour/src/images/red-piece.png");
    /**
     * Creates new form Board
     */
    public Board(String p1Name, String p2Name) {
        initComponents();
        createPlayers(p1Name, p2Name);
        clearBoard();
    }
    
    private void createPlayers(String p1Name, String p2Name){
        p1 = new Player(p1Name);
        p2 = new Player(p2Name);
    }
    
    private void clearBoard(){
        oneOne.setIcon(emptySpace);
        oneTwo.setIcon(emptySpace);
        oneThree.setIcon(emptySpace);
        oneFour.setIcon(emptySpace);
        oneFive.setIcon(emptySpace);
        oneSix.setIcon(emptySpace);
        oneSeven.setIcon(emptySpace);
        twoOne.setIcon(emptySpace);
        twoTwo.setIcon(emptySpace);
        twoThree.setIcon(emptySpace);
        twoFour.setIcon(emptySpace);
        twoFive.setIcon(emptySpace);
        twoSix.setIcon(emptySpace);
        twoSeven.setIcon(emptySpace);
        threeOne.setIcon(emptySpace);
        threeTwo.setIcon(emptySpace);
        threeThree.setIcon(emptySpace);
        threeFour.setIcon(emptySpace);
        threeFive.setIcon(emptySpace);
        threeSix.setIcon(emptySpace);
        threeSeven.setIcon(emptySpace);
        fourOne.setIcon(emptySpace);
        fourTwo.setIcon(emptySpace);
        fourThree.setIcon(emptySpace);
        fourFour.setIcon(emptySpace);
        fourFive.setIcon(emptySpace);
        fourSix.setIcon(emptySpace);
        fourSeven.setIcon(emptySpace);
        fiveOne.setIcon(emptySpace);
        fiveTwo.setIcon(emptySpace);
        fiveThree.setIcon(emptySpace);
        fiveFour.setIcon(emptySpace);
        fiveFive.setIcon(emptySpace);
        fiveSix.setIcon(emptySpace);
        fiveSeven.setIcon(emptySpace);
        sixOne.setIcon(emptySpace);
        sixTwo.setIcon(emptySpace);
        sixThree.setIcon(emptySpace);
        sixFour.setIcon(emptySpace);
        sixFive.setIcon(emptySpace);
        sixSix.setIcon(emptySpace);
        sixSeven.setIcon(emptySpace);
        pOneLabel.setText(p1.getName());
        pTwoLabel.setText(p2.getName());
        turn = true;
        piece = "r";
        game.clearActualBoard();
        turnTextArea.setText("Players Turn:\n" + p1.getName());
    }
    
    private void addPiece(int col){
        int row = game.setActualBoardPiece(col, piece);
        if(row != -1){
            setGuiPiece(row, col);
            if(game.checkGuiWin()){
                String name;
                if(piece.equals("r")){
                    name = p1.getName();
                } else{
                    name = p2.getName();
                }
                turnTextArea.setText("Congratulations "+name + ". You've won.");
            } else if(game.isTie()){
                turnTextArea.setText("It's a tie. Thanks for playing.");
            } else{
                switchTurn();
            }
        }
    }
    
    private void setGuiPiece(int row, int col){
        ImageIcon piece = null;
        if(this.piece.equals("r")){
            piece = redPiece;
        } else{
            piece = blackPiece;
        }
        if(col == 0){
            if(row == 5){
                sixOne.setIcon(piece);
            }
            else if(row == 4){
                fiveOne.setIcon(piece);
            }
            else if(row == 3){
                fourOne.setIcon(piece);
            }
            else if(row == 2){
                threeOne.setIcon(piece);
            }
            else if(row == 1){
                twoOne.setIcon(piece);
            }
            else{
                oneOne.setIcon(piece);
            }
        }
        else if(col == 1){
            if(row == 5){
                sixTwo.setIcon(piece);
            }
            else if(row == 4){
                fiveTwo.setIcon(piece);
            }
            else if(row == 3){
                fourTwo.setIcon(piece);
            }
            else if(row == 2){
                threeTwo.setIcon(piece);
            }
            else if(row == 1){
                twoTwo.setIcon(piece);
            }
            else{
                oneTwo.setIcon(piece);
            }
        }
        else if(col == 2){
            if(row == 5){
                sixThree.setIcon(piece);
            }
            else if(row == 4){
                fiveThree.setIcon(piece);
            }
            else if(row == 3){
                fourThree.setIcon(piece);
            }
            else if(row == 2){
                threeThree.setIcon(piece);
            }
            else if(row == 1){
                twoThree.setIcon(piece);
            }
            else{
                oneThree.setIcon(piece);
            }
        }
        else if(col == 3){
            if(row == 5){
                sixFour.setIcon(piece);
            }
            else if(row == 4){
                fiveFour.setIcon(piece);
            }
            else if(row == 3){
                fourFour.setIcon(piece);
            }
            else if(row == 2){
                threeFour.setIcon(piece);
            }
            else if(row == 1){
                twoFour.setIcon(piece);
            }
            else{
                oneFour.setIcon(piece);
            }
        }
        else if(col == 4){
            if(row == 5){
                sixFive.setIcon(piece);
            }
            else if(row == 4){
                fiveFive.setIcon(piece);
            }
            else if(row == 3){
                fourFive.setIcon(piece);
            }
            else if(row == 2){
                threeFive.setIcon(piece);
            }
            else if(row == 1){
                twoFive.setIcon(piece);
            }
            else{
                oneFive.setIcon(piece);
            }
        }
        else if(col == 5){
            if(row == 5){
                sixSix.setIcon(piece);
            }
            else if(row == 4){
                fiveSix.setIcon(piece);
            }
            else if(row == 3){
                fourSix.setIcon(piece);
            }
            else if(row == 2){
                threeSix.setIcon(piece);
            }
            else if(row == 1){
                twoSix.setIcon(piece);
            }
            else{
                oneSix.setIcon(piece);
            }
        }
        else{
            if(row == 5){
                sixSeven.setIcon(piece);
            }
            else if(row == 4){
                fiveSeven.setIcon(piece);
            }
            else if(row == 3){
                fourSeven.setIcon(piece);
            }
            else if(row == 2){
                threeSeven.setIcon(piece);
            }
            else if(row == 1){
                twoSeven.setIcon(piece);
            }
            else{
                oneSeven.setIcon(piece);
            }
        }
    }
    
    private void switchTurn(){
        turn = !turn;
        if(piece.equals("r")){
            piece = "b";
            turnTextArea.setText("Players Turn:\n" + p2.getName());
        } else{
            piece = "r";
            turnTextArea.setText("Players Turn:\n" + p1.getName());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        board = new javax.swing.JPanel();
        oneOne = new javax.swing.JLabel();
        oneTwo = new javax.swing.JLabel();
        oneThree = new javax.swing.JLabel();
        oneFour = new javax.swing.JLabel();
        oneFive = new javax.swing.JLabel();
        oneSix = new javax.swing.JLabel();
        oneSeven = new javax.swing.JLabel();
        twoOne = new javax.swing.JLabel();
        twoTwo = new javax.swing.JLabel();
        twoThree = new javax.swing.JLabel();
        twoFour = new javax.swing.JLabel();
        twoFive = new javax.swing.JLabel();
        twoSix = new javax.swing.JLabel();
        twoSeven = new javax.swing.JLabel();
        threeOne = new javax.swing.JLabel();
        fourOne = new javax.swing.JLabel();
        fiveOne = new javax.swing.JLabel();
        sixOne = new javax.swing.JLabel();
        threeTwo = new javax.swing.JLabel();
        fourTwo = new javax.swing.JLabel();
        fiveTwo = new javax.swing.JLabel();
        sixTwo = new javax.swing.JLabel();
        threeThree = new javax.swing.JLabel();
        threeFour = new javax.swing.JLabel();
        threeFive = new javax.swing.JLabel();
        threeSix = new javax.swing.JLabel();
        threeSeven = new javax.swing.JLabel();
        sixThree = new javax.swing.JLabel();
        fourFour = new javax.swing.JLabel();
        fourFive = new javax.swing.JLabel();
        fourSix = new javax.swing.JLabel();
        fourSeven = new javax.swing.JLabel();
        fiveFour = new javax.swing.JLabel();
        fiveFive = new javax.swing.JLabel();
        fiveSix = new javax.swing.JLabel();
        fiveSeven = new javax.swing.JLabel();
        sixFour = new javax.swing.JLabel();
        sixFive = new javax.swing.JLabel();
        sixSix = new javax.swing.JLabel();
        fourThree = new javax.swing.JLabel();
        fiveThree = new javax.swing.JLabel();
        sixSeven = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        pOneLabel = new javax.swing.JLabel();
        pTwoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        turnTextArea = new javax.swing.JTextArea();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 150, 150));
        jLabel1.setText("Connect Four");

        board.setBackground(new java.awt.Color(255, 255, 0));

        oneOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colOneMouseClicked(evt);
            }
        });

        oneTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colTwoMouseClicked(evt);
            }
        });

        oneThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colThreeMouseClicked(evt);
            }
        });

        oneFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFourMouseClicked(evt);
            }
        });

        oneFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFiveMouseClicked(evt);
            }
        });

        oneSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSixMouseClicked(evt);
            }
        });

        oneSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSevenMouseClicked(evt);
            }
        });

        twoOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colOneMouseClicked(evt);
            }
        });

        twoTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colTwoMouseClicked(evt);
            }
        });

        twoThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colThreeMouseClicked(evt);
            }
        });

        twoFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFourMouseClicked(evt);
            }
        });

        twoFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFiveMouseClicked(evt);
            }
        });

        twoSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSixMouseClicked(evt);
            }
        });

        twoSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSevenMouseClicked(evt);
            }
        });

        threeOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colOneMouseClicked(evt);
            }
        });

        fourOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colOneMouseClicked(evt);
            }
        });

        fiveOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colOneMouseClicked(evt);
            }
        });

        sixOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colOneMouseClicked(evt);
            }
        });

        threeTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colTwoMouseClicked(evt);
            }
        });

        fourTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colTwoMouseClicked(evt);
            }
        });

        fiveTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colTwoMouseClicked(evt);
            }
        });

        sixTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colTwoMouseClicked(evt);
            }
        });

        threeThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colThreeMouseClicked(evt);
            }
        });

        threeFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFourMouseClicked(evt);
            }
        });

        threeFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFiveMouseClicked(evt);
            }
        });

        threeSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSixMouseClicked(evt);
            }
        });

        threeSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSevenMouseClicked(evt);
            }
        });

        sixThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colThreeMouseClicked(evt);
            }
        });

        fourFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFourMouseClicked(evt);
            }
        });

        fourFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFiveMouseClicked(evt);
            }
        });

        fourSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSixMouseClicked(evt);
            }
        });

        fourSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSevenMouseClicked(evt);
            }
        });

        fiveFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFourMouseClicked(evt);
            }
        });

        fiveFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFiveMouseClicked(evt);
            }
        });

        fiveSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSixMouseClicked(evt);
            }
        });

        fiveSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSevenMouseClicked(evt);
            }
        });

        sixFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFourMouseClicked(evt);
            }
        });

        sixFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colFiveMouseClicked(evt);
            }
        });

        sixSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSixMouseClicked(evt);
            }
        });

        fourThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colThreeMouseClicked(evt);
            }
        });

        fiveThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colThreeMouseClicked(evt);
            }
        });

        sixSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colSevenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardLayout.createSequentialGroup()
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sixOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(twoOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(threeOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fourOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fiveOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardLayout.createSequentialGroup()
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oneTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oneThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoThree, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oneFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twoFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oneFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoFive, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oneSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoSix, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oneSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(twoSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(boardLayout.createSequentialGroup()
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sixTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(fiveTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeTwo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fourTwo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(boardLayout.createSequentialGroup()
                                .addComponent(threeThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(threeFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(boardLayout.createSequentialGroup()
                                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(boardLayout.createSequentialGroup()
                                        .addComponent(sixThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(boardLayout.createSequentialGroup()
                                        .addComponent(fourThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6))
                                    .addGroup(boardLayout.createSequentialGroup()
                                        .addComponent(fiveThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fourFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fiveFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sixFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(threeFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fourFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sixFive, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(threeSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fourSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sixSix, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fiveSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(fourSeven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sixSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardLayout.createSequentialGroup()
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oneOne, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(oneTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(twoSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(twoSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoFour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(twoFive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(threeSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(twoTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(twoOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
                            .addGroup(boardLayout.createSequentialGroup()
                                .addComponent(twoThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(threeOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(threeThree, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardLayout.createSequentialGroup()
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fourThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fourOne, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(fourTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fiveOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveThree, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardLayout.createSequentialGroup()
                                .addComponent(fourFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(boardLayout.createSequentialGroup()
                                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fourFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fourSix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fourSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fiveFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fiveSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardLayout.createSequentialGroup()
                        .addGroup(boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sixOne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(sixTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sixThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(sixFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        exitButton.setText("Leave Game");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        pOneLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        pOneLabel.setForeground(new java.awt.Color(255, 153, 0));
        pOneLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pTwoLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        pTwoLabel.setForeground(new java.awt.Color(255, 153, 0));
        pTwoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        turnTextArea.setEditable(false);
        turnTextArea.setColumns(20);
        turnTextArea.setFont(new java.awt.Font("Utsaah", 0, 36)); // NOI18N
        turnTextArea.setLineWrap(true);
        turnTextArea.setRows(5);
        turnTextArea.setText("Players Turn:");
        turnTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(turnTextArea);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pOneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pTwoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pOneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTwoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
        confour.ConnectFour.mainFrame.setVisible(true);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void colOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colOneMouseClicked
        addPiece(0);
    }//GEN-LAST:event_colOneMouseClicked

    private void colTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colTwoMouseClicked
        addPiece(1);
    }//GEN-LAST:event_colTwoMouseClicked

    private void colThreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colThreeMouseClicked
        addPiece(2);
    }//GEN-LAST:event_colThreeMouseClicked

    private void colFourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colFourMouseClicked
        addPiece(3);
    }//GEN-LAST:event_colFourMouseClicked

    private void colFiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colFiveMouseClicked
        addPiece(4);
    }//GEN-LAST:event_colFiveMouseClicked

    private void colSixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colSixMouseClicked
        addPiece(5);
    }//GEN-LAST:event_colSixMouseClicked

    private void colSevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colSevenMouseClicked
        addPiece(6);
    }//GEN-LAST:event_colSevenMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel board;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel fiveFive;
    private javax.swing.JLabel fiveFour;
    private javax.swing.JLabel fiveOne;
    private javax.swing.JLabel fiveSeven;
    private javax.swing.JLabel fiveSix;
    private javax.swing.JLabel fiveThree;
    private javax.swing.JLabel fiveTwo;
    private javax.swing.JLabel fourFive;
    private javax.swing.JLabel fourFour;
    private javax.swing.JLabel fourOne;
    private javax.swing.JLabel fourSeven;
    private javax.swing.JLabel fourSix;
    private javax.swing.JLabel fourThree;
    private javax.swing.JLabel fourTwo;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel oneFive;
    private javax.swing.JLabel oneFour;
    private javax.swing.JLabel oneOne;
    private javax.swing.JLabel oneSeven;
    private javax.swing.JLabel oneSix;
    private javax.swing.JLabel oneThree;
    private javax.swing.JLabel oneTwo;
    private javax.swing.JLabel pOneLabel;
    private javax.swing.JLabel pTwoLabel;
    private javax.swing.JLabel sixFive;
    private javax.swing.JLabel sixFour;
    private javax.swing.JLabel sixOne;
    private javax.swing.JLabel sixSeven;
    private javax.swing.JLabel sixSix;
    private javax.swing.JLabel sixThree;
    private javax.swing.JLabel sixTwo;
    private javax.swing.JLabel threeFive;
    private javax.swing.JLabel threeFour;
    private javax.swing.JLabel threeOne;
    private javax.swing.JLabel threeSeven;
    private javax.swing.JLabel threeSix;
    private javax.swing.JLabel threeThree;
    private javax.swing.JLabel threeTwo;
    private javax.swing.JTextArea turnTextArea;
    private javax.swing.JLabel twoFive;
    private javax.swing.JLabel twoFour;
    private javax.swing.JLabel twoOne;
    private javax.swing.JLabel twoSeven;
    private javax.swing.JLabel twoSix;
    private javax.swing.JLabel twoThree;
    private javax.swing.JLabel twoTwo;
    // End of variables declaration//GEN-END:variables
}
