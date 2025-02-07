/*******************************************************************************
 * Copyright (c) 2018 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.phoebus.logbook.olog.ui;

import org.phoebus.framework.nls.NLS;

public class Messages
{
    public static String
            AdvancedSearchOpen,
            AdvancedSearchHide,
            Apply,
            CloseRequestHeader,
            CloseRequestButtonContinue,
            CloseRequestButtonDiscard,
            DownloadSelected,
            DownloadingAttachments,
            EmbedImageDialogTitle,
            File,
            FileSave,
            FileSaveFailed,
            GroupingFailed,
            GroupSelectedEntries,
            Level,
            Logbooks,
            LogbooksSearchFailTitle,
            LogbookServiceUnavailableTitle,
            LogbookServiceHasNoLogbooks,
            LogbooksTitle,
            LogbooksTooltip,
            NewLogEntry,
            NoAttachments,
            NoClipboardContent,
            Normal,
            NoSearchResults,
            PreviewOpenErrorBody,
            PreviewOpenErrorTitle,
            SelectFile,
            SelectFolder,
            ShowHideDetails;
    static
    {
        // initialize resource bundle
        NLS.initializeMessages(Messages.class);
    }

    private Messages()
    {
        // prevent instantiation
    }
}
