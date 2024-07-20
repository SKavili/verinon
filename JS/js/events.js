document.addEventListener('DOMContentLoaded', (event) => {
    // onclick Event
    document.getElementById('myButton').addEventListener('click', function() {
      //  alert('Button clicked!');
      alert(document.URL)
       let formElement= document.getElementById('hoverBox')
       formElement.innerHTML="<h1>testsssssssssssss</h1>"
    });

    // onmouseover and onmouseout Events
    const hoverBox = document.getElementById('hoverBox');
    hoverBox.addEventListener('mouseover', function() {
        this.style.backgroundColor = 'yellow';
    });
    hoverBox.addEventListener('mouseout', function() {
        this.style.backgroundColor = '';
    });

    // onchange Event
    document.getElementById('textInput').addEventListener('change', function() {
        alert('Text changed!');
    });

    // onfocus and onblur Events
    const focusInput = document.getElementById('focusInput');
    focusInput.addEventListener('focus', function() {
        this.style.backgroundColor = 'lightblue';
    });
    focusInput.addEventListener('blur', function() {
        this.style.backgroundColor = '';
    });

    // onsubmit Event
    document.getElementById('myForm').addEventListener('submit', function(event) {
        alert('Form submitted!');
         event.preventDefault(); // Prevent form submission
    });
});
