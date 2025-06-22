fetch('/categories')
    .then(response => {
        if(!response.ok){
            throw new Error('Network response was not OK');
        }
        return response.json();
    })
    .then(data => {
        const list = document.getElementById('categoryList');

        data.forEach(category => {
            const li = document.createElement('li');
            li.textContent = `${category.name}`;
            list.appendChild(li);
        });
    })
    .catch(error =>{
        console.error('Error while fetching categories:', error);
    });

fetch(`/products/by-category-id/3`)
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to fetch products');
        }
        return response.json();
    })
    .then(products => {
        const productList = document.getElementById('productList');
        productList.innerHTML = ''; // clear old results

        products.forEach(product => {
            const li = document.createElement('li');
            li.textContent = product.name; // adjust fields as needed
            productList.appendChild(li);
        });
    })
    .catch(error => {
        console.error('Error fetching products:', error);
    });