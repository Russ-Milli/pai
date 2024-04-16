package com.register.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.register.myapplication.FruitModel
import com.register.myapplication.ui.theme.MyApplicationTheme

class Customlist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    
                    Customtin()


                }
            }
        }
    }


}

data class FruitModel(val name:String, val image : Int)
@Composable
fun ListRow(model:FruitModel)

{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.Green)
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(
            text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
        )
    }


    }
    private val fruitsList= mutableListOf<FruitModel>().apply {
            add(FruitModel("Apple", R.drawable.app))
            add(FruitModel("Orange", R.drawable.oranges))
            add(FruitModel("Banana", R.drawable.ban))
            add(FruitModel("Strawberry", R.drawable.straw))
            add(FruitModel("Mango", R.drawable.mangoes))
        }


@Composable
fun Customtin() {
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
        ){
        items(fruitsList) { model ->
            ListRow(model = model)

        }

}
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    ) {
        // ...
    }


}

//@Composable
//fun Customlist(model: Int) {

//}

//fun <LazyItemScope> items(count: MutableList<FruitModel>, itemContent: @Composable LazyItemScope.(index: Int) -> Unit) {

//}




@Preview
@Composable
private fun Customprev(){
    Customtin()



}
