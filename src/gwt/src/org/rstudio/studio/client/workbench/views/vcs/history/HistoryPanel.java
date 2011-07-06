package org.rstudio.studio.client.workbench.views.vcs.history;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import org.rstudio.core.client.Debug;
import org.rstudio.core.client.widget.ModalDialog;
import org.rstudio.core.client.widget.ModalDialogBase;
import org.rstudio.studio.client.workbench.views.vcs.history.HistoryPresenter.Display;

import java.util.ArrayList;

public class HistoryPanel extends Composite
   implements Display
{
   public HistoryPanel()
   {
      commitTable_ = new CellTable<CommitInfo>();

      TextColumn<CommitInfo> idCol = new TextColumn<CommitInfo>()
      {
         @Override
         public String getValue(CommitInfo object)
         {
            return object.getId();
         }
      };
      commitTable_.addColumn(idCol);

      TextColumn<CommitInfo> subjectCol = new TextColumn<CommitInfo>()
      {
         @Override
         public String getValue(CommitInfo object)
         {
            return object.getSubject();
         }
      };
      commitTable_.addColumn(subjectCol);

      initWidget(commitTable_);
   }

   @Override
   public void setData(ArrayList<CommitInfo> commits)
   {
      commitTable_.setPageSize(commits.size());
      commitTable_.setRowData(commits);
   }

   @Override
   public void showModal()
   {
      ModalDialogBase modal = new ModalDialogBase()
      {
         @Override
         protected Widget createMainWidget()
         {
            this.addCancelButton();

            ScrollPanel scroller =  new ScrollPanel(HistoryPanel.this);
            scroller.setSize("800px", "600px");
            return scroller;
         }
      };

      modal.showModal();
   }

   private final CellTable<CommitInfo> commitTable_;
}
