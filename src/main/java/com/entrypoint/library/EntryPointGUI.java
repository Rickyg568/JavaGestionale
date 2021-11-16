package com.entrypoint.library;

import java.util.ArrayList;

public class EntryPointGUI extends javax.swing.JFrame {

    public EntryPointGUI() {
        initComponents();
        controller = new Controller();
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryPointGUI().setVisible(true);
            }
        });
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddWindow = new javax.swing.JFrame();
        addLabel1 = new javax.swing.JLabel();
        addLabel2 = new javax.swing.JLabel();
        addLabel3 = new javax.swing.JLabel();
        addTitle = new javax.swing.JTextField();
        addAuthors = new javax.swing.JTextField();
        addGenres = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        AlterWindow = new javax.swing.JFrame();
        AlterComboBox = new javax.swing.JComboBox<>();
        AlterLabel1 = new javax.swing.JLabel();
        AlterLabel2 = new javax.swing.JLabel();
        AlterLabel3 = new javax.swing.JLabel();
        AlterTitle = new javax.swing.JTextField();
        AlterAuthors = new javax.swing.JTextField();
        AlterGenres = new javax.swing.JTextField();
        AlterBtn = new javax.swing.JToggleButton();
        RemoveWindow = new javax.swing.JFrame();
        RemoveComboBox = new javax.swing.JComboBox<>();
        RemoveRemoveBtn = new javax.swing.JToggleButton();
        MainAddBtn = new javax.swing.JButton();
        MainPrintConsoleLog = new javax.swing.JButton();
        MainSaveBtn = new javax.swing.JButton();
        MainLoadBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainTextBox = new javax.swing.JTextArea();
        MainPrintBtn = new javax.swing.JToggleButton();
        MainAlterBtn = new javax.swing.JToggleButton();
        MainRemoveBtn = new javax.swing.JToggleButton();

        AddWindow.setBounds(new java.awt.Rectangle(0, 0, 1024, 720));
        AddWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                addWindowClosing(evt);
            }
        });

        addLabel1.setText("Title  :");

        addLabel2.setText("Authors  :");

        addLabel3.setText("Genres  :");

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddWindowLayout = new javax.swing.GroupLayout(AddWindow.getContentPane());
        AddWindow.getContentPane().setLayout(AddWindowLayout);
        AddWindowLayout.setHorizontalGroup(
            AddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddWindowLayout.createSequentialGroup()
                .addGroup(AddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddWindowLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(AddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddWindowLayout.createSequentialGroup()
                                .addComponent(addLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                            .addGroup(AddWindowLayout.createSequentialGroup()
                                .addComponent(addLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(addGenres))
                            .addGroup(AddWindowLayout.createSequentialGroup()
                                .addComponent(addLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(addAuthors))))
                    .addGroup(AddWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        AddWindowLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addLabel1, addLabel2, addLabel3});

        AddWindowLayout.setVerticalGroup(
            AddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddWindowLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(AddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddWindowLayout.createSequentialGroup()
                        .addGroup(AddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addLabel1)
                            .addComponent(addTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addLabel2))
                    .addComponent(addAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addLabel3)
                    .addComponent(addGenres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AlterWindow.setBounds(new java.awt.Rectangle(0, 0, 1024, 720));
        AlterWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                AlterWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                AlterWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AlterWindowOpened(evt);
            }
        });

        AlterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        AlterLabel1.setText("Title  :");

        AlterLabel2.setText("Authors  :");

        AlterLabel3.setText("Genres  :");

        AlterBtn.setText("Alter");
        AlterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlterWindowLayout = new javax.swing.GroupLayout(AlterWindow.getContentPane());
        AlterWindow.getContentPane().setLayout(AlterWindowLayout);
        AlterWindowLayout.setHorizontalGroup(
            AlterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlterWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AlterWindowLayout.createSequentialGroup()
                        .addComponent(AlterLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(AlterTitle))
                    .addGroup(AlterWindowLayout.createSequentialGroup()
                        .addComponent(AlterLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(AlterAuthors))
                    .addGroup(AlterWindowLayout.createSequentialGroup()
                        .addComponent(AlterLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(AlterGenres))
                    .addGroup(AlterWindowLayout.createSequentialGroup()
                        .addComponent(AlterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 461, Short.MAX_VALUE)))
                .addContainerGap())
        );

        AlterWindowLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AlterLabel1, AlterLabel2, AlterLabel3});

        AlterWindowLayout.setVerticalGroup(
            AlterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlterWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AlterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AlterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlterLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlterLabel2)
                    .addComponent(AlterAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlterWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlterLabel3)
                    .addComponent(AlterGenres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(AlterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AlterWindowLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AlterLabel1, AlterLabel2, AlterLabel3});

        RemoveWindow.setBounds(new java.awt.Rectangle(0, 0, 1024, 720));
        RemoveWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                RemoveWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                RemoveWindowClosing(evt);
            }
        });

        RemoveComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        RemoveComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveComboBoxActionPerformed(evt);
            }
        });

        RemoveRemoveBtn.setText("Remove");
        RemoveRemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveRemoveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RemoveWindowLayout = new javax.swing.GroupLayout(RemoveWindow.getContentPane());
        RemoveWindow.getContentPane().setLayout(RemoveWindowLayout);
        RemoveWindowLayout.setHorizontalGroup(
            RemoveWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoveWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RemoveWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RemoveRemoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(RemoveWindowLayout.createSequentialGroup()
                        .addComponent(RemoveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 612, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RemoveWindowLayout.setVerticalGroup(
            RemoveWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoveWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RemoveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(RemoveRemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Manager");
        setBounds(new java.awt.Rectangle(0, 0, 1024, 720));
        setName("MainWindow"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                MainWindowActivated(evt);
            }
        });

        MainAddBtn.setText("New Book");
        MainAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainAddBtnActionPerformed(evt);
            }
        });

        MainPrintConsoleLog.setText("Console Print Book");
        MainPrintConsoleLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainPrintConsoleLogActionPerformed(evt);
            }
        });

        MainSaveBtn.setText("Save");
        MainSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainSaveBtnActionPerformed(evt);
            }
        });

        MainLoadBtn.setText("Load");
        MainLoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainLoadBtnActionPerformed(evt);
            }
        });

        MainTextBox.setEditable(false);
        MainTextBox.setColumns(20);
        MainTextBox.setRows(5);
        MainTextBox.setFocusable(false);
        jScrollPane1.setViewportView(MainTextBox);

        MainPrintBtn.setText("Print Book");
        MainPrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainPrintBtnActionPerformed(evt);
            }
        });

        MainAlterBtn.setText("Alter Book");
        MainAlterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainAlterBtnActionPerformed(evt);
            }
        });

        MainRemoveBtn.setText("Remove Book");
        MainRemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainRemoveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MainAddBtn)
                        .addGap(18, 18, 18)
                        .addComponent(MainAlterBtn)
                        .addGap(18, 18, 18)
                        .addComponent(MainRemoveBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MainPrintConsoleLog)
                        .addGap(18, 18, 18)
                        .addComponent(MainPrintBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(MainSaveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(MainLoadBtn)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MainPrintBtn, MainPrintConsoleLog});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MainAddBtn, MainAlterBtn, MainRemoveBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainAddBtn)
                    .addComponent(MainAlterBtn)
                    .addComponent(MainRemoveBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainPrintConsoleLog)
                    .addComponent(MainSaveBtn)
                    .addComponent(MainLoadBtn)
                    .addComponent(MainPrintBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    //************************************************************************//
    //                              GUI EVENTS                                //
    private void MainAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainAddBtnActionPerformed
        this.setVisible(false);
        AddWindow.setVisible(true);
    }//GEN-LAST:event_MainAddBtnActionPerformed

    private void addWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_addWindowClosing
        this.setVisible(true);
        AddWindow.setVisible(false);
    }//GEN-LAST:event_addWindowClosing

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       
        String newTitle = addTitle.getText();
        ArrayList<String> newAuthors = IsMultiple(addAuthors);
        ArrayList<String> newGenres = IsMultiple(addGenres);
        
        controller.AddBook(newTitle, newAuthors, newGenres);
        
        this.setVisible(true);
        AddWindow.setVisible(false);
    }//GEN-LAST:event_addButtonActionPerformed

    private void MainPrintConsoleLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainPrintConsoleLogActionPerformed
        CPrintBooks();
    }//GEN-LAST:event_MainPrintConsoleLogActionPerformed

    private void MainSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainSaveBtnActionPerformed
        controller.SaveData();
    }//GEN-LAST:event_MainSaveBtnActionPerformed

    private void MainLoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainLoadBtnActionPerformed
        controller.LoadData();
    }//GEN-LAST:event_MainLoadBtnActionPerformed

    private void MainWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_MainWindowActivated
        TBPrintBooks();
    }//GEN-LAST:event_MainWindowActivated

    private void MainPrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainPrintBtnActionPerformed
        TBPrintBooks();
    }//GEN-LAST:event_MainPrintBtnActionPerformed

    private void AlterWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AlterWindowOpened
        AlterComboBox.removeAllItems();
        
        for(Book book : controller.GetBooks())
            AlterComboBox.addItem(book._getTitle());
    }//GEN-LAST:event_AlterWindowOpened

    private void MainAlterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainAlterBtnActionPerformed
        this.setVisible(false);
        AlterWindow.setVisible(true);
    }//GEN-LAST:event_MainAlterBtnActionPerformed

    private void AlterWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AlterWindowClosing
        AlterWindow.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_AlterWindowClosing

    private void AlterWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AlterWindowActivated
       AlterComboBox.removeAllItems();
        
        for(Book book : controller.GetBooks())
            AlterComboBox.addItem(book._getTitle());
    }//GEN-LAST:event_AlterWindowActivated

    private void AlterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterBtnActionPerformed
        
        ArrayList<String> newAuthors = controller.GetBooks().get(AlterComboBox.getSelectedIndex())._getAuthors();
        ArrayList<String> newGenres = controller.GetBooks().get(AlterComboBox.getSelectedIndex())._getGenres();
        String newTitle = controller.GetBooks().get(AlterComboBox.getSelectedIndex())._getTitle();
        
        if(!AlterTitle.getText().isEmpty())
            newTitle = AlterTitle.getText();
        
        if(!AlterAuthors.getText().isEmpty())
            newAuthors = IsMultiple(AlterAuthors);
        
        if(!AlterGenres.getText().isEmpty())
            newAuthors = IsMultiple(AlterGenres);
        
        controller.AlterBook(newTitle, newAuthors, newGenres, AlterComboBox.getSelectedIndex());
        
        AlterWindow.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_AlterBtnActionPerformed

    private void RemoveComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveComboBoxActionPerformed
       
    }//GEN-LAST:event_RemoveComboBoxActionPerformed

    private void RemoveWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_RemoveWindowActivated
        RemoveComboBox.removeAllItems();
        
        for(Book book : controller.GetBooks())
            RemoveComboBox.addItem(book._getTitle());
    }//GEN-LAST:event_RemoveWindowActivated

    private void MainRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainRemoveBtnActionPerformed
        this.setVisible(false);
        RemoveWindow.setVisible(true);
    }//GEN-LAST:event_MainRemoveBtnActionPerformed

    private void RemoveWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_RemoveWindowClosing
        RemoveWindow.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_RemoveWindowClosing

    private void RemoveRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveRemoveBtnActionPerformed
        controller.RemoveBook(RemoveComboBox.getSelectedIndex());
        RemoveWindow.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_RemoveRemoveBtnActionPerformed
    //                              GUI EVENTS                                //
    //************************************************************************//
    
    //************************************************************************//
    //                            MY UTIL FUNCTIONS                           //
    private ArrayList<String> IsMultiple(javax.swing.JTextField InputBox){
        
        ArrayList<String> splitted = new ArrayList<>();
        
        String[] split = InputBox.getText().split(",");
        for(String cut : split) splitted.add(cut);
        
        return splitted;
    }
    private void CPrintBooks(){
        controller.GetBooks().forEach( book -> {
            System.out.println("Title : " + book._getTitle() + "\n");
            
            book._getAuthors().forEach( author ->  {
                System.out.println("Author : " + author);
                
            } );
            System.out.println("\n");
            
            
            book._getGenres().forEach( genres ->  {
                System.out.println("Genres : " + genres);
            } );
        
        } );
    }
    private void TBPrintBooks(){
        String toPrint = new String();
        int counter = 1;
        
        
        for(Book book : controller.GetBooks()){
            toPrint += "----------------------------------------\n";
            toPrint += String.valueOf(counter) + ")\n";
            toPrint += "Title : " + book._getTitle() + "\n";
            toPrint += "Authors :";
            for(var aut : book._getAuthors()){
                toPrint += " - " + aut;
            }
            toPrint += "\n";
            toPrint += "Genres :";
            for(var gen : book._getGenres()){
                toPrint += " - " + gen;
            }
            toPrint += "\n";
            toPrint += "----------------------------------------\n";
            counter++;
        }
        
        MainTextBox.setText(toPrint);
    }
    //                            MY UTILS FUNCTIONS                          //
    //************************************************************************//
    
    
// <editor-fold defaultstate="collapsed" desc="MY VARIABLES">    
    Controller controller;
//</editor-fold> 
// <editor-fold defaultstate="collapsed" desc="GUI VARIABLES">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AddWindow;
    private javax.swing.JTextField AlterAuthors;
    private javax.swing.JToggleButton AlterBtn;
    private javax.swing.JComboBox<String> AlterComboBox;
    private javax.swing.JTextField AlterGenres;
    private javax.swing.JLabel AlterLabel1;
    private javax.swing.JLabel AlterLabel2;
    private javax.swing.JLabel AlterLabel3;
    private javax.swing.JTextField AlterTitle;
    private javax.swing.JFrame AlterWindow;
    private javax.swing.JButton MainAddBtn;
    private javax.swing.JToggleButton MainAlterBtn;
    private javax.swing.JButton MainLoadBtn;
    private javax.swing.JToggleButton MainPrintBtn;
    private javax.swing.JButton MainPrintConsoleLog;
    private javax.swing.JToggleButton MainRemoveBtn;
    private javax.swing.JButton MainSaveBtn;
    private javax.swing.JTextArea MainTextBox;
    private javax.swing.JComboBox<String> RemoveComboBox;
    private javax.swing.JToggleButton RemoveRemoveBtn;
    private javax.swing.JFrame RemoveWindow;
    private javax.swing.JTextField addAuthors;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addGenres;
    private javax.swing.JLabel addLabel1;
    private javax.swing.JLabel addLabel2;
    private javax.swing.JLabel addLabel3;
    private javax.swing.JTextField addTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
