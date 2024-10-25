package com.stevdza_san.shared.domain

import androidx.compose.runtime.mutableStateListOf

data class Recipe(
    val id: Int,
    val image: String,
    val title: String,
    val description: String,
    val category: String,
    val preparationTime: Int,
    val ingredients: String,
    val instructions: String,
    val isFavorite: Boolean
)

val foodRecipes = mutableStateListOf(
    Recipe(
        id = 0,
        image = "https://www.allrecipes.com/thmb/Vg2cRidr2zcYhWGvPD8M18xM_WY=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/11973-spaghetti-carbonara-ii-DDMFS-4x3-6edea51e421e4457ac0c3269f3be5157.jpg",
        title = "Spaghetti Carbonara",
        description = "Classic Italian pasta dish with a creamy sauce made from eggs, cheese, pancetta, and pepper.",
        category = "Pasta",
        preparationTime = 25,
        ingredients = "Spaghetti, Eggs, Parmesan Cheese, Pancetta, Black Pepper, Salt",
        instructions = """
            1. Cook spaghetti. 
            2. Fry pancetta until crispy. 
            3. Mix eggs and cheese in a bowl. 
            4. Combine cooked spaghetti, pancetta, and egg mixture. 
            5. Serve with extra cheese and pepper.
            """".trimIndent(),
        isFavorite = false
    ),
    Recipe(
        id = 1,
        image = "https://kitchenfunwithmy3sons.com/wp-content/uploads/2022/06/fluffy-pancakes-feature.jpg",
        title = "Fluffy Pancakes",
        description = "Soft and fluffy pancakes, perfect for a breakfast treat.",
        category = "Breakfast",
        preparationTime = 20,
        ingredients = "Flour, Baking Powder, Milk, Eggs, Sugar, Butter, Vanilla Extract",
        instructions = """
            1. Mix dry ingredients. 
            2. Whisk wet ingredients. 
            3. Combine and stir until smooth. 
            4. Cook on a hot griddle. 
            5. Serve with syrup and berries.
        """.trimIndent(),
        isFavorite = false
    ),
    Recipe(
        id = 2,
        image = "https://s23209.pcdn.co/wp-content/uploads/2019/08/Easy-Chicken-TacosIMG_9890.jpg",
        title = "Chicken Tacos",
        description = "Spicy chicken tacos with fresh salsa and avocado.",
        category = "Mexican",
        preparationTime = 30,
        ingredients = "Chicken Breast, Taco Shells, Lettuce, Tomato, Avocado, Salsa, Cheese, Taco Seasoning",
        instructions = """
            1. Cook chicken with taco seasoning. 
            2. Warm taco shells. 
            3. Fill with chicken, salsa, avocado, and toppings. 
            4. Serve with lime wedges.
        """.trimIndent(),
        isFavorite = false
    ),
    Recipe(
        id = 3,
        image = "https://www.thecookierookie.com/wp-content/uploads/2023/05/grilled-salmon-recipe-2.jpg",
        title = "Grilled Lemon Herb Salmon",
        description = "Deliciously grilled salmon with a zesty lemon herb marinade.",
        category = "Seafood",
        preparationTime = 25,
        ingredients = "Salmon Fillets, Lemon, Olive Oil, Garlic, Thyme, Salt, Pepper",
        instructions = """
            1. Marinate salmon in lemon, garlic, and herbs. 
            2. Grill for 8-10 minutes. 
            3. Serve with grilled vegetables.
        """.trimIndent(),
        isFavorite = false
    ),
    Recipe(
        id = 4,
        image = "https://groundbeefrecipes.com/wp-content/uploads/double-bacon-cheeseburger-recipe-6-500x500.jpg",
        title = "Cheeseburger",
        description = "Juicy beef cheeseburger with fresh toppings and a toasted bun.",
        category = "Fast Food",
        preparationTime = 20,
        ingredients = "Ground Beef, Cheese, Lettuce, Tomato, Onion, Burger Buns, Ketchup, Mustard",
        instructions = """
            1. Form beef patties and grill.
            2. Toast buns.
            3. Assemble with toppings and condiments.
            4. Serve with fries.
        """.trimIndent(),
        isFavorite = false
    ),
    Recipe(
        id = 5,
        image = "https://www.allrecipes.com/thmb/FL-xnyAllLyHcKdkjUZkotVlHR8=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/46822-indian-chicken-curry-ii-DDMFS-4x3-39160aaa95674ee395b9d4609e3b0988.jpg",
        title = "Chicken Curry",
        description = "Rich and creamy Indian chicken curry with a blend of aromatic spices.",
        category = "Indian",
        preparationTime = 40,
        ingredients = "Chicken, Onion, Garlic, Ginger, Tomatoes, Curry Powder, Coconut Milk, Spices",
        instructions = """
            1. Sauté onion, garlic, and ginger.
            2. Add spices and tomatoes.
            3. Add chicken and coconut milk.
            4. Simmer until cooked.
            5. Serve with rice.
        """.trimIndent(),
        isFavorite = false
    ),
    Recipe(
        id = 6,
        image = "https://cdn.shopify.com/s/files/1/0274/9503/9079/files/20220211142754-margherita-9920_5a73220e-4a1a-4d33-b38f-26e98e3cd986.jpg?v=1723650067",
        title = "Margherita Pizza",
        description = "Classic pizza with fresh mozzarella, basil, and tomato sauce.",
        category = "Italian",
        preparationTime = 15,
        ingredients = "Pizza Dough, Tomato Sauce, Mozzarella Cheese, Basil, Olive Oil, Salt",
        instructions = """
            1. Preheat oven.
            2. Roll out dough and add sauce, cheese, and basil. 
            3. Bake for 12 minutes. 
            4. Drizzle with olive oil and serve.
        """.trimIndent(),
        isFavorite = false
    ),
    Recipe(
        id = 7,
        image = "https://evergreenkitchen.ca/wp-content/uploads/2021/10/Creamy-Mushroom-Risotto-0-4X5.jpg",
        title = "Mushroom Risotto",
        description = "Creamy risotto with sautéed mushrooms and Parmesan cheese.",
        category = "Italian",
        preparationTime = 45,
        ingredients = "Arborio Rice, Mushrooms, Onion, Garlic, Chicken Broth, Parmesan Cheese, Butter",
        instructions = """
            1. Sauté onion and mushrooms.
            2. Add rice and broth, cook slowly.
            3. Stir in Parmesan and butter. 
            4. Serve hot.
        """.trimIndent(),
        isFavorite = false
    ),
    Recipe(
        id = 8,
        image = "https://www.thesmalltownfoodie.com/wp-content/uploads/2018/05/Vegetable-Stir-Fry2.png",
        title = "Vegetable Stir-fry",
        description = "Quick and healthy stir-fry with a medley of fresh vegetables and a soy-based sauce.",
        category = "Asian",
        preparationTime = 15,
        ingredients = "Bell Peppers, Broccoli, Carrots, Soy Sauce, Garlic, Ginger, Sesame Oil",
        instructions = """
            1. Stir-fry vegetables with garlic and ginger.
            2. Add soy sauce and sesame oil.
            3. Serve with rice or noodles.
        """.trimIndent(),
        isFavorite = false
    ),
    Recipe(
        id = 9,
        image = "https://bakingwithgranny.co.uk/wp-content/uploads/2017/01/brownies2-500x500.jpg",
        title = "Chocolate Brownies",
        description = "Rich, fudgy chocolate brownies with a gooey center and crispy edges.",
        category = "Dessert",
        preparationTime = 35,
        ingredients = "Chocolate, Butter, Sugar, Eggs, Flour, Cocoa Powder, Vanilla Extract",
        instructions = """
            1. Melt chocolate and butter.
            2. Mix in sugar, eggs, and vanilla.
            3. Stir in dry ingredients.
            4. Bake for 25 minutes.
        """.trimIndent(),
        isFavorite = false
    )
)