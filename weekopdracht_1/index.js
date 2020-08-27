function click_cell() {
    let rows = document.getElementById('4by4_table').rows;
    for (let i = 0; i < rows.clientHeight; i++) {
        for (let j = 0; j < rows[i].cells.length; j++) {
            rows[i].cells[j].addEventListener('click', console.log('click'));
        }
    }
}