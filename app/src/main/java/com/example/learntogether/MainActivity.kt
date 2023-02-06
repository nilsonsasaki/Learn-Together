package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DescriptionScreen()
                }
            }
        }
    }
}

@Composable
fun DescriptionScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        BackgroundImage()
        TitleText()
        ComposeDescriptionText()
        TutorialDescription()
    }
}

@Composable
fun BackgroundImage() {
    Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = stringResource(R.string.compose_banner_description),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun TitleText() {
    Text(
        text = stringResource(id = R.string.compose_tutorial_title),
        modifier = Modifier.padding(all = 16.dp),
        fontSize = 24.sp
    )
}

@Composable
fun ComposeDescriptionText() {
    Text(
        text = stringResource(id = R.string.compose_description),
        modifier = Modifier.padding(horizontal = 16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun TutorialDescription() {
    Text(
        text = stringResource(id = R.string.tutorial_description),
        modifier = Modifier.padding(all = 16.dp),
        fontSize = 16.sp, textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {
        DescriptionScreen()
    }
}