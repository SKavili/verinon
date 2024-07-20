document.addEventListener('DOMContentLoaded', () => {
    const cardContainer = document.querySelector('.card-container');
    const listContainer = document.querySelector('.list');

    function addCard(title, description, imageUrl) {
        const card = document.createElement('div');
        card.classList.add('card');

        card.innerHTML = `
            <img src="${imageUrl}" alt="${title}">
            <div class="card-content">
                <h2>${title}</h2>
                <p>${description}</p>
            </div>
        `;

        cardContainer.appendChild(card);
    }

    function addListItem(title, description) {
        const listItem = document.createElement('li');
        listItem.classList.add('list-item');

        listItem.innerHTML = `
            <h3>${title}</h3>
            <p>${description}</p>
        `;

        listContainer.appendChild(listItem);
    }

    // Example usage: Add a new card and list item after 2 seconds
    setTimeout(() => {
        addCard('New Card Title', 'This is a description for the new card.', 'https://via.placeholder.com/150');
        addListItem('New List Item', 'This is a description for the new list item.');
    }, 2000);
});
