document.addEventListener('DOMContentLoaded', function() {
    const display = document.querySelector('.display');
    const buttons = document.querySelectorAll('.buttons button');

    let currentInput = '';
    let calculation = '';

    buttons.forEach(button => {
        button.addEventListener('click', function() {
            const value = this.textContent;

            if (value === '=') {
                calculation = currentInput;
                currentInput = eval(calculation);
                display.textContent = currentInput;
                calculation = '';
            } else if (value === 'C') {
                currentInput = '';
                calculation = '';
                display.textContent = '0';
            } else {
                currentInput += value;
                display.textContent = currentInput;
            }
        });
    });
});
