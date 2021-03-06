/*
 * ISABEL: A group collaboration tool for the Internet
 * Copyright (C) 2009 Agora System S.A.
 * 
 * This file is part of Isabel.
 * 
 * Isabel is free software: you can redistribute it and/or modify
 * it under the terms of the Affero GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Isabel is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Affero GNU General Public License for more details.
 * 
 * You should have received a copy of the Affero GNU General Public License
 * along with Isabel.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * prueba2.java
 *
 * Created on 20 de septiembre de 2004, 20:12
 */

package services.isabel.services.guis;

import javax.swing.*;

/**
 *
 * @author  lailoken
 */
public class CheckParticipantsPanel extends javax.swing.JPanel {
  
  private DefaultListModel listModel= new DefaultListModel();;

  
  /** Creates new form prueba2 */
  public CheckParticipantsPanel(String session, String participants) {
    initComponents();
    sessionLabel.setText(session);
    initList(participants);
  }
  
  
  public void initList(String participants) {
    String[] participantsList = participants.split(" ");
    for (int i=0; i<participantsList.length;i++) {
      listModel.addElement(participantsList[i]);
    }
    list.setModel(listModel);
  }
  
  
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    java.awt.GridBagConstraints gridBagConstraints;

    textLabel = new javax.swing.JLabel();
    sessionLabel = new javax.swing.JLabel();
    listScrollPanel = new javax.swing.JScrollPane();
    list = new javax.swing.JList();

    setLayout(new java.awt.GridBagLayout());

    textLabel.setFont(new java.awt.Font("MS Sans Serif", 1, 12));
    textLabel.setText("Nicknames already in use for session:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    add(textLabel, gridBagConstraints);

    sessionLabel.setFont(new java.awt.Font("MS Sans Serif", 1, 12));
    sessionLabel.setText("session");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    add(sessionLabel, gridBagConstraints);

    listScrollPanel.setPreferredSize(new java.awt.Dimension(160, 150));
    listScrollPanel.setViewportView(list);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
    add(listScrollPanel, gridBagConstraints);

  }//GEN-END:initComponents
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JList list;
  private javax.swing.JScrollPane listScrollPanel;
  private javax.swing.JLabel sessionLabel;
  private javax.swing.JLabel textLabel;
  // End of variables declaration//GEN-END:variables
  
}
