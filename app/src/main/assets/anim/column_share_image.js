function _columnGetHtml() {
    var text, selection, range, container;
    if (window.getSelection) {
        selection = window.getSelection();
    } else if (window.document.getSelection) {
        selection = window.document.getSelection();
    } else if (window.document.selection) {
        selection = window.document.selection;
        return selection.createRange().htmlText;
    }
    if (selection.rangeCount > 0) {
        range = selection.getRangeAt(0);
        container = window.document.createElement('div');
        container.appendChild(range.cloneContents());
        text = container.innerHTML;
    }
    return text || '';
}

function _columnGetSharePage() {
    window.biliColumn.getSharePageContent(window.getSharedPage());
}

function _columnGetSelectHtml() {
    window.biliColumn.onSelectHtml(_columnGetHtml());
}

